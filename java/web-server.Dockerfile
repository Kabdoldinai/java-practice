FROM ubuntu
LABEL maintainer="Kabdoldina Indira"

USER root
COPY ./web-server.bash /

RUN chmod 755 /web-server.bash
RUN apt -y update
RUN apt -y install bash netcat

USER nobody

ENTRYPOINT [ "/web-server.bash" ]
