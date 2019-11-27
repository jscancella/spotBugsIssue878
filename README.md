# Spotbugs issue 878
This project is an example of the spotbugs issue #878 https://github.com/spotbugs/spotbugs/issues/878.
To reproduce the error this needs to be run with Java 11. In my specific case it is:
```
openjdk 11.0.4 2019-07-16
OpenJDK Runtime Environment (build 11.0.4+11-post-Ubuntu-1ubuntu218.04.3)
OpenJDK 64-Bit Server VM (build 11.0.4+11-post-Ubuntu-1ubuntu218.04.3, mixed mode, sharing)
```

run `./gradlew clean spotbugsmain` on the command line
