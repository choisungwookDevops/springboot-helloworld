# https://hub.docker.com/r/choisunguk/springboot-helloworld/tags
IMAGE_NAME=choisunguk/springboot-helloworld:v1

create-builder:
	docker buildx create --name mybuilder --use

build-push:
	docker buildx build --platform linux/amd64,linux/arm64 -t $(IMAGE_NAME) --push .

.PHONY: create-builder build-push
