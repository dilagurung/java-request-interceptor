# java-request-interceptor
Quick example on intervening request and response using HandleInterceptorAdapter and WebMVCConfiguratorAdapter

Explanation : Spring Inteceptor :

In real life whenever you visit any organized office, you have to first go to reception. Receptionist upon getting your information generate a badge and hand it over to you . Now that badge remain with you till you’re in that office. You meet the desired person and all is done . Similiarly in Http Based request, you can allocate an entity to intervene the incoming request and modify the header as per your need. Header is the part of http request which holds metadata about that request. In our example Request is a person who has come to visit office, badge is the header info attached to that request.  Interceptor can not only be used to modify header but a body too.
In spring interceptor are the functions which are executed before they reach controller.


Request ------------->Interceptor--------------->Controller.

In Spring concept of interceptor  is implement by class called HandleInterceptorAdapter class. You have a two options of making your class Interceptor. Either implement HandleInterceptor interface or extend HandleInterceptorAdapter. (In intellij use Ctrl+O to override super class)




There are no limitation as far as number of interceptors are concern. You can have create any number of interceptor depending upon your needs.
Before creating Interceptor, Let’s have the steps to followed.

Create a Controller class by annotating it with @Controller.
Create a class and make it interceptor just by extending HandleInterceptorAdapter.
Register your interceptor in 	WebMVcConfigurerAdapter. Ensure the class is annotated by @Configuration and (Add or exclude patterns with addPattern or excludePattern respectively).
(Optional) Let’s get it through Thymeleaf.






