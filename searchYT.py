
from selenium import webdriver
from getpass import getpass
import time



search = input('what video would you like to search? ')
driver = webdriver.Chrome("C:\\Python\\Python38\\chromedriver.exe")
driver.get("https://www.youtube.com/")
bar = driver.find_element_by_xpath('/html/body/ytd-app/div/div/ytd-masthead/'
                                   'div[3]/div[2]/ytd-searchbox/form/div/div[1]/input')
bar.send_keys(search)
driver.find_element_by_id('search-icon-legacy').click()
time.sleep(2)
driver.find_element_by_xpath(
    '/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/'
    'div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd'
    '-video-renderer[1]/div[1]/div/div[1]/div/h3/a').click()




