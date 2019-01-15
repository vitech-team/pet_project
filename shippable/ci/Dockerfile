FROM ubuntu:18.04
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y nodejs
RUN apt-get install -y npm
RUN apt-get install -y wget
RUN apt-get install -y unzip
RUN apt-get install -y gettext-base
RUN apt-get install -y locales-all
RUN apt-get install -y curl
RUN wget https://releases.hashicorp.com/terraform/0.11.10/terraform_0.11.10_linux_amd64.zip
RUN unzip terraform_0.11.10_linux_amd64.zip
RUN mv terraform /usr/local/bin/

COPY install.sh .
COPY start-chrome.sh .
RUN chmod 777 install.sh .
RUN chmod 777 start-chrome.sh .
RUN ./install.sh
RUN ./start-chrome.sh
