## Decorator
装饰者模式主要用于对原有对象进行动态拓展。装饰者与被装饰者具有相同的方法。

首先需要一个原有的对象，这个对象可以是接口也可以是抽象类，一般被装饰者与装饰者实现同一个接口。

装饰者可以有很多不同的功能或者属性，由不同的具体装饰者类实现，这些类有一个公共的抽象父类。

在父类中持有下一个装饰者的引用（接口形式，为了能够由原始类进行拓展）。

每个具体装饰者的构造方法方法根据拓展的功能重写接口中的方法。

最终调用时，被装饰者被第一个装饰者持有，第一个装饰者被下一个装饰者持有，一层包一层，所以装饰者模式也被称作包装（Wrapper）模式。

装饰者模式的缺点是当要拓展的功能比较多时，会生成很多相似的对象，不容易排查错误。