#!/bin/bash

# Espera o RabbitMQ estar pronto
sleep 10

# Cria a fila de teste
rabbitmqadmin declare queue name=teste_docker durable=true
