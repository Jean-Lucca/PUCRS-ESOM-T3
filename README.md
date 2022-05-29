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
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/overview.png)
## Presentation Layer
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/presentation-layer-fixed.png)
## Controller Layer

## Service Layer

## Persistency Layer
![alt text](https://github.com/Jean-Lucca/PUCRS-ESOM-T3/blob/main/models/service-layer.png)
## Design Patterns
- Facade - ClienteRestController
- Singleton - Spring @Autowired
- Strategy - Interface ClienteService
- Repository - Spring @Repository
## Decisões Arquiteturais
- Implementação - Java 
- Testes - JUnit 5
- Arquitetura - Camadas
- Backend - Spring
- Independência de banco de dados
