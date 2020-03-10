# Scala Performance
A collection of micro experiments on the JVM from Scala, to understand the implications on the heap usage and performance.

## Running the tests
For now, there's just some run configurations in `.idea/runConfigurations` which can be imported and run in IntelliJ.
These runs generate a flight recording and a heapdump on OOM Error as they are configured to use Epsilon GC.