# RMI Playground

Discovering Java's Remote Method Invocation (RMI) procedures.

Packages an RMI server into a JAR and lets a client execute Java code remotely through the server's RMI interface.  
Also offers the possibility to package and test the server as a Docker container, as a proof-of-concept.

## The Server

### Option #1: standalone server
1. `./build.sh` to compile the source code
2. `./server.sh` to run the server

### Option #2: server as a Docker image
1. `./build-docker.sh` to compile the source code into a Docker image
2. `./server-docker.sh` to run the server as a Docker container

## The Client

> Make sure to have built the code with either `./build.sh` or `./build-docker.sh` prior to this.

```bash
./client.sh [n]
```
Run a batch of `n` remote invocations, defaulting to `1` if no argument specified.  
Use `-1` to loop indefinitely.
