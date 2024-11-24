FROM rabbitmq:management

COPY init.sh /init.sh
RUN chmod +x /init.sh
CMD ["sh", "/init.sh & rabbitmq-server"]


