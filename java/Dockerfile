FROM ubuntu

LABEL maintainer="Kabdoldina Indira"

USER root

COPY entrypoint.bash /

RUN apt -y update
RUN apt -y install curl bash
RUN chmod 755 /entrypoint.bash

USER nobody

ENTRYPOINT [ "/entrypoint.bash" ]
