@Load
Feature: Trino TPC-DS Load tests
  Results of TPCDS Load tests on Trino

  Scenario: TPC-DS Load test - 99 queries, 1 user, 1 GB of Data
    Given Trino is configured with 2 workers
    When  99 TPC-DS benchmark queries are run
    Then Report of time taken by each query should be returned

  Scenario: TPC-DS Load test - 99 queries, 5 user, 10 GB of Data
    Given Trino is configured with 2 workers
    When  99 TPC-DS benchmark queries are run
    Then Report of time taken by each query should be returned