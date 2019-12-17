# -*- coding: UTF8 -*-
import requests
import datetime

'''
1.talk to telegram bot by going to telegram and starting chat with @theleulbot
2.run program and start typing the keywords for response
3.see data the bot recieves on compiler

'''
class BotHandler:
    def __init__(self, token):
            self.token = token
            self.api_url = "https://api.telegram.org/bot{}/".format(token)

    #url = "https://api.telegram.org/bot<token>/"

    def get_updates(self, offset=0, timeout=30):
        method = 'getUpdates'
        params = {'timeout': timeout, 'offset': offset}
        resp = requests.get(self.api_url + method, params)
        result_json = resp.json()['result']
        return result_json

    def send_message(self, chat_id, text):
        params = {'chat_id': chat_id, 'text': text, 'parse_mode': 'HTML'}
        method = 'sendMessage'
        resp = requests.post(self.api_url + method, params)
        return resp

    def get_first_update(self):
        get_result = self.get_updates()

        if len(get_result) > 0:
            last_update = get_result[0]
        else:
            last_update = None

        return last_update


token = '1016403344:AAFBUDaIzosE9SWBHRr1oiqZoL1vI7jdpdU' #Token of your bot
magnito_bot = BotHandler(token) #Your bot's name



def main():
    new_offset = 0
    print('hi, now launching...')

    while True:
        all_updates=magnito_bot.get_updates(new_offset)

        if len(all_updates) > 0:
            for current_update in all_updates:
                print(current_update)
                first_update_id = current_update['update_id']
                if 'text' not in current_update['message']:
                    first_chat_text='New member'
                else:
                    first_chat_text = current_update['message']['text']
                first_chat_id = current_update['message']['chat']['id']
                if 'first_name' in current_update['message']:
                    first_chat_name = current_update['message']['chat']['first_name']
                elif 'new_chat_member' in current_update['message']:
                    first_chat_name = current_update['message']['new_chat_member']['username']
                elif 'from' in current_update['message']:
                    first_chat_name = current_update['message']['from']['first_name']
                else:
                    first_chat_name = "unknown"

                if first_chat_text == 'Hi':
                    magnito_bot.send_message(first_chat_id, 'Morning ' + first_chat_name)
                    new_offset = first_update_id + 1
                elif first_chat_text == 'how are you?':
                    magnito_bot.send_message(first_chat_id, 'I am well ' + first_chat_name)
                    new_offset = first_update_id + 1 
                elif first_chat_text == 'customizer?':
                    magnito_bot.send_message(first_chat_id, 'Leul W has customized this current version, ' + first_chat_name)
                    new_offset = first_update_id + 1 
                elif first_chat_text == 'link resume?':
                    magnito_bot.send_message(first_chat_id, 'Sure thing, I will send you a link, just provide your email to leulwubete@outlook.com,  ' + first_chat_name)
                    new_offset = first_update_id + 1      
                else:
                    magnito_bot.send_message(first_chat_id, 'Hey, Contact leulwubete@outlook.com for questions, my commands are(case sensitive): Hi, how are you?, customizer?,link resume?  Thank you for visiting, '+first_chat_name)
                    new_offset = first_update_id + 1


if __name__ == '__main__':
    try:
        main()
    except KeyboardInterrupt:
        exit()