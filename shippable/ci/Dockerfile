FROM ubuntu:18.04
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y nodejs
RUN apt-get install -y npm
RUN apt-get install -y wget
RUN apt-get install -y unzip
RUN apt-get install -y gettext-base
RUN apt-get install -y locales-all
RUN wget https://releases.hashicorp.com/terraform/0.11.10/terraform_0.11.10_linux_amd64.zip
RUN unzip terraform_0.11.10_linux_amd64.zip
RUN mv terraform /usr/local/bin/
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get install -y ./google-chrome*.deb
RUN wget https://chromedriver.storage.googleapis.com/2.45/chromedriver_linux64.zip
RUN unzip chromedriver_linux64.zip
RUN mv chromedriver /usr/local/bin


CMD terraform --version

