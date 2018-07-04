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

## projecteuler.net
This is a Ruby script that does not require an installation of any additional library, so there is no need for a custom built image.

You can run this script in the following way:
```shell extension
$ sudo docker container run --rm -v "$PWD":/usr/src/myapp ruby ruby /usr/src/myapp/problem10.rb
```

## testsftp
This Ruby script lists files from a remote sftp server. And this script requires net-sftp library, that is why it's reasonable to build a new image with net-sftp library installed.

Build this image and run a new container and see results:
```shell extension
$ sudo docker image build -t testsftp:1.0 .
$ sudo docker container run --rm testsftp:1.0
```

## testlamp
Here in this lab a LAMP stack is built. 

- **L**    [Debian Linux](https://store.docker.com/images/debian)
- **A**    [The Apache HTTP Server](https://store.docker.com/images/httpd) 
- **M**    [MariaDB Server](https://store.docker.com/images/mariadb) 
- **P**    [PHP](https://store.docker.com/images/php) 

In addition to the images listed above, [SFTP Server](https://store.docker.com/community/images/atmoz/sftp) is used here. Also, this lab features [volumes](https://docs.docker.com/storage/volumes/) and [user-defined bridge networks](https://docs.docker.com/network/bridge/).

Let's see how this works:

Firstly, we'll create named Volumes and User-defined bridge networks
```shell extension
# sudo docker network create -d bridge bg-net
# sudo docker network create -d bridge fg-net
# sudo docker volume create db-vol
# sudo docker volume create httpd-vol
```

