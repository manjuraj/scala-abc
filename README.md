## scala-abc

Skeleton scala project with sbt. This skeleton uses scala 2.11.8 and sbt 0.13.15

## Build

```sh
sbt clean compile package assembly

sbt run
Or,
sbt 'run-main com.example.Main'
Or,
java -jar target/scala-2.11/abc-assembly-1.0.0.jar
```

## References

- [Final scala 2.10 and java releases](https://finagle.github.io/blog/2016/04/20/scala-210-and-java7/)
