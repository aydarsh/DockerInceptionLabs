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

## testsftp
This Ruby script lists files from a remote sftp server. And this script requires net-sftp library, that is why it's reasonable to build a new image with net-sftp library installed.

Build this image and run a new container and see results:
```shell extension
$ sudo docker image build -t testsftp:1.0 .
$ sudo docker container run --rm testsftp:1.0
```
