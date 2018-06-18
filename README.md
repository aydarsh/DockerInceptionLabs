# 'Docker: Inception' Training Course Labs

## testjava
ENTRYPOINT and CMD directives are used here.
When ENTRYPOINT is used, then that command will be executed.
CMD shows default arguments, that can be overriden.

Have a look at the application run results:
```shell extension
$ sudo docker image build -t quadraticequation:1.0 .
$ sudo docker container run --rm quadraticequation:1.0
$ sudo docker container run --rm quadraticequation:1.0 1 2018 -2019
$ sudo docker container run --rm quadraticequation:1.0 1 2 a
$ sudo docker container run --rm quadraticequation:1.0 1 2
$ sudo docker container run --rm quadraticequation:1.0 0 2 -2
```


