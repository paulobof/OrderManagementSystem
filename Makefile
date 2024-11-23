build:
	mvn complile

package:
	mvn package

docker-start:
	docker compose -f docker-compose.yaml up -d

docker-stop:
	docker compose down