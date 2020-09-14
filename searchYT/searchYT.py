
from selenium import webdriver
from getpass import getpass
from selenium.webdriver.common.keys import Keys
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

if "imp" in search:
    driver.execute_script("window.open('about:blank', 'tab2');")
    driver.switch_to.window("tab2")
    driver.get('https://www.google.com/')
    searching = driver.find_element_by_xpath('/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input')
    searching.click()
    searching.send_keys(search)
    driver.find_element_by_xpath('//*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]').click()
    time.sleep(1)
    driver.find_element_by_xpath('/html/body/div[6]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/a').click()








