# Docker Short Note:

## Docker Overview:

- Docker:

- Docker containers are built from Docker images.

</br>

## Docker Workflow

Run in terminal:
    
    sudo docker run hello-world
	
Result (shows how it works):
	
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

</br>

## Docker Commands

1. Docker Status Check

        sudo systemctl status docker
	
2. Show available docker subcommands:

	    docker
		
3. Search docker images

	    docker search [image name]
	
4. Run Docker container (If image not exists of container, then download the image and run it)

	    docker run [image name]
	
5. Run Container with Interactive Shell

        fasd
	
6. Exit from container shell

	    exit
	
7. Download Docker image
	
	    docker pull [image name]
	
8. Show Docker images

	    docker images
	
9. Show All Running / Active Container

	    docker ps
	
10. Show All Active and Inactive Container

	    docker ps -a
	
11. Show Latest Created Container

	    docker ps -l	 
	
12. Start a Container

	    docker start [container id]
	
13. Stop a Container

	    docker stop [container id or container name]

14. Remove a Container

	    docker rm [container id or container name]
	
15. Rename a Container

	    docker rename my_container my_new_container

</br>

[Source 1](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-20-04)