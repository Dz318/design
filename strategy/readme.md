## 策略模式(常规方式+注解方式)

策略模式是开发人员在开发过程中使用最多的设计模式之一，使用策略模式可以避免使用（if-else）多重条件转移语句。总之使用该模式的好处就是降低系统耦合，方便后期拓展。这也是开发系统的一个原则。
但是它的缺点也是存在的，如下:

（1）客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道算法或行为的情况。

（2）由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么具体策略类的数目就会很可观。

在策略模式中的角色有： 

抽象策略(Strategy)角色:这是一个抽象角色，通常由一个接口或抽象类实现,用以声明所有具体策略类要实现的方法。 

具体策略(ConcreteStrategy)角色:各种策略（算法）的具体实现。 

环境(Context)角色:策略的外部封装类，或者说策略的容器类，它持有一个Strategy的引用，Strategy策略由客户端决定，不同Strategy策略可以执行不同的行为。 

### 项目应用场景 
客户购买物品选择不同支付方式支付。
我们在网上后买商品时，支付的时候会有多种支付方式选择，例如支付宝、微信，选择不同的支付方式可能影响最终支付的金额(例如有红包可以抵扣)，当然这是对用户而言。对平台而言可能在支付过程中肯定还会有其他的业务处理，所在在系统设计阶段要考虑这些问题，所在在这个业务场景下，策略模式能够发挥出很大的作用。

### 项目环境
SpringBoot、Mybatis、MySQL(运行项目下的payment.sql文件)

项目中对应的角色

抽象策略角色: BasePay:定义了payMent(Integer channelId, Integer goodId)抽象方法,需要传入物品编号和支付类型编号

具体策略角色: AliPay、ICBCPay、WeChatPay 这些具体实现对象都是实现了BasePay的

策略角色抽象类: AbstractPay, 在常规策略模式的三个角色中又提取了具体策略角色的一个抽象对象,该对象用于注入所有具体策略角色所使用的Service,定义具体策略角色的通用方法。

AbstractPay类中注入有若干实现类，但该类不作实例化，所以需要自定义BeanUtils将Spring管理的实现例赋值到AbstractPay的对象属性中

环境(Context)角色: PayContext, 该类提供了常规方式与注解方式