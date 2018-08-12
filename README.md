# TSTest-Template Pattern

## Introduction
TSTest-Template Pattern(Test Service-Test-Template Pattern) is a test framework based on template. It’s like the java “Template method” design pattern, if most cases share the same test logic like “send request,wait for complation,verify”, this framework can be used. The common logic is defined in a template class like BaseCase,and supply the common implementation，any cases can extend it and overwrite the common implementation if need

A example case like below,
```
  class BaseCase {
      templateTest() {
          send();
          wait();
          verify()
      }
      
      send() {
        .....
      }
      
      wait() {
        .....
      }
      
      verify() {
        .....
      }
  }
  
  class CaseA extends BaseCase {
      //use base send and wait
      
      @Override
      verify() {
        //customized verify logic
      }
  }

```

## Author
Jun Qin
## Bug and issues
If you find any bug or issues, be free to send mail to zeroneqin@163.com
## License
MIT️Jun Qin
