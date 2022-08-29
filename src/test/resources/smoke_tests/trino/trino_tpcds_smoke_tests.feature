@Smoke
Feature: Trino TPC-DS Smoke tests
  Results of TPCDS Smoke tests on Trino

  Scenario: TPC-DS Smoke test - 3 queries, 1 user, 1 GB of Data
    Given Trino is configured with 2 workers
    When  3 TPC-DS benchmark queries are run
    Then Report of time taken by each query should be returned

  Scenario: TPC-DS Smoke test - 3 queries, 5 user, 2 GB of Data
    Given Trino is configured with 2 workers
    When  3 TPC-DS benchmark queries are run
    Then Report of time taken by each query should be returned