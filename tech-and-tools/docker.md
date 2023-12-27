# **Docker Short Note**

## Docker Overview

- **Docker** is an open source platform to build, share and run applications. It use OS-level virtualization to deliver applicatons in packages called container.

- **Docker Engine:** The software that hosts the container is called Docker Engine.

- **Docker Image:** Docker is a template that has a predefined set of instructions to build a container. Docker images contain application code, libraries, tools, dependencies, and other files needed to make an application run. It is the starting point of Docker.

- **Docker Container:** Docker containers are built from Docker images. Conatiners are running version of images or an instance of image.

- **Docker File:** The Docker file is the document of steps to set up the environment for the Application.
The Docker Engine parses the Docker file and creates a Docker image from it.

</br>

## Docker Workflow

> Run in terminal:

    sudo docker run hello-world

> Result (shows how it works):

```
Unable to find image 'hello-world:latest' locally
latest: Pulling from library/hello-world
2db29710123e: Pull complete 
Digest: sha256:6e8b6f026e0b9c419ea0fd02d3905dd0952ad1feea67543f525c73a0a790fefb
Status: Downloaded newer image for hello-world:latest

Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
	1. The Docker client contacted the Docker daemon.
	2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
	(amd64)
	3. The Docker daemon created a new container from that image which runs the
	executable that produces the output you are currently reading.
	4. The Docker daemon streamed that output to the Docker client, which sent it
	to your terminal.
```

</br>

## Docker Commands

1. Docker Status Check

        sudo systemctl status docker
	
2. Show available Docker subcommands:

	    docker
		
3. Search Docker Images

		docker search [image name]

4. Download Docker Image

	    docker pull [image name]

5. Show Docker Images

	    docker images

6. Delete Docker Image

	    docker image rm [image name]

7. Run Docker Container from Image (If image not exists, then download the image and run container from it)

	    docker run [image name]
	
8. Run Container from Image with Interactive Shell

        docker run -it [image name]

9.  Run Docker Container (Exists Container)

	    docker start [container id or container name]
	
10. Run a Container with Interactive Shell

        docker start -i [container id or container name]

11. Stop a Container

        docker stop [container id or container name]

12. Remove a Container

	    docker rm [container id or container name]
	
13. Rename a Container

	    docker rename my_container my_new_container
	
14. Exit from container shell

	    exit
	
15. Show All Running / Active Container

	    docker ps
	
16. Show All Active and Inactive Container

	    docker ps -a
	
17. Show Latest Created Container

	    docker ps -l

18. Save the state of a container as a new Docker Image

	    docker commit -m "What you did to the image" -a "Author info" [container_id] [new_image_name]

19. Build a Docker Image from Dockerfile (Open terminal where Dockerfile exist)

	    docker build -t [image_name] .

		or docker build [docker file path] --tag [image name]

</br>

## Docker File / Script

- It's called Dockerfile (Filename is also Dockerfile without any extension)

- Image name should lowercase

- Dockerfile example (Inside script):

```Dockerfile
# Each instruction in this file generates a new layer that gets pushed to your local image cache

# Lines preceeded by # are regarded as comments and ignored

#  Select the base image to build the new image on top of
FROM ubuntu:20.04

# Identify the maintainer of an image
MAINTAINER Arif "demo@gmail.com"

# Update the image to the latest packages and download jdk-8
RUN apt-get update && apt-get install -y openjdk-8-jdk

# Directory where files will be saved
WORKDIR /usr/local/bin/

# The jar run from current directory (.)
ADD test-app.jar .

# Excute the below commmand when contianer is run
ENTRYPOINT ["java", "-jar", "test-app.jar"]
```

</br>

- Docker basic note [source-1](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-20-04 "Digital Ocean")

- Dockerfile note [source-2](https://linuxize.com/post/how-to-build-docker-images-with-dockerfile/#:~:text=Building%20the%20Image,-The%20next%20step&text=To%20do%20so%20run%20the,build%20%2Dt%20linuxize%2Fredis%20.&text=The%20option%20%2Dt%20specifies%20the,%2Fimagename%3Atag'%20format. "Linuxize")