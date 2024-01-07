@Elements
Feature: Migros Feature

  Background:
    * Navigate to  https://www.migros.com.tr/

  Scenario: Migros Project
    * Wait for 1
    * Accept advert
    * Wait for 1
    * Accept cookies
    * Wait for 1
    * Close popup
    * Wait for 1
    * Scroll page 1400
    * Wait for 2
    * Click Pet Shop
    * Wait for 2
    * Assert Pet Shop
    * Wait for 1
    * Click onerilen
    * Wait for 1
    * Click en dusuk

