# **Docker Short Note**

## Docker Overview

- Docker is an open source platform to build, share and run applications. It use OS-level virtualization to deliver applicatons in packages called container.

- The software that hosts the container is called Docker Engine.

- Docker containers are built from Docker images.

- Conatiners are running version of images or an instance of image.

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
	
2. Show available docker subcommands:

	    docker
		
3. Search docker images

	    docker search [image name]

4. Run Docker Container from Image (If image not exists of container, then download the image and run it)

	    docker run [image name]
	
5. Run Container from Image with Interactive Shell

        docker run -it [image name]

6. Run Docker Container

	    docker start [container id or container name]
	
7. Run a Container with Interactive Shell

        docker start -i [container id or container name]

8. Stop a Container

        docker stop [container id or container name]

9. Remove a Container

	    docker rm [container id or container name]
	
10. Rename a Container

	    docker rename my_container my_new_container
	
11. Exit from container shell

	    exit
	
12. Download Docker image

	    docker pull [image name]
	
13. Show Docker images

	    docker images
	
14. Show All Running / Active Container

	    docker ps
	
15. Show All Active and Inactive Container

	    docker ps -a
	
16. Show Latest Created Container

	    docker ps -l

17. Save the state of a container as a new Docker Image

	    docker commit -m "What you did to the image" -a "Author info" [container_id] [new_image_name]

18. Build a Docker Image from Dockerfile (Open terminal where Dockerfile exist)

	    docker build -t [image_name] .

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
MAINTAINER Al Amin Arif "mdarifkanon@gmail.com"

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