# ESOM-T3
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Jean-Lucca_PUCRS-ESOM-T3&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Jean-Lucca_PUCRS-ESOM-T3)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Jean-Lucca_PUCRS-ESOM-T3&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=Jean-Lucca_PUCRS-ESOM-T3)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Jean-Lucca_PUCRS-ESOM-T3&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=Jean-Lucca_PUCRS-ESOM-T3)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Jean-Lucca_PUCRS-ESOM-T3&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=Jean-Lucca_PUCRS-ESOM-T3)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Jean-Lucca_PUCRS-ESOM-T3&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=Jean-Lucca_PUCRS-ESOM-T3)

## Descrição da Aplicação
API Rest desenvolvida utilizando o Spring Framework, consistente na implementação das operações CRUD(create, reduce, update, delete), alem disso foi criado um cliente HTTP utilizando Spring Cloud OpenFeign para consumo da API do viaCEP.
#### Objetivos
- Configuração do analisador de código
- No mínimo três decisões arquiteturais
- No mínimo três modelos
- Aplicação de padrões de projeto
## Architecture Overview
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/overview-fixed.png)
## Presentation Layer
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/presentation-layer.png)
## Controller Layer
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/Controller%20Layer.png)

## Camadas
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/camadas.png)

## Service Layer
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/service-layer-fixed.png)

## Persistency Layer
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/Persist%C3%AAncia.png)

## Design Patterns
- Facade - ClienteRestController
- Singleton - Spring @Autowired
- Strategy - Interface ClienteService
- Repository - Spring @Repository
## Decisões Arquiteturais
- Implementamos em Java com backend Spring, o que torna o projeto portabilidade com vários dispositivos.
- Os testes foram feitos com o JUnit 5, por isso ele é confiável.
- O SonarCloud garante manutenabilidade, segurança e confiabilidade.
