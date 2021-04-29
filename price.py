import requests
from bs4 import BeautifulSoup
import smtplib
import time

url = "https://www.amazon.com/-/zh_TW/dp/B07SPFPKF4/ref=sr_1_10?dchild=1&keywords=hard+drives&qid=1619677444&sr=8-10"
headers = {"User-Agent": 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.93 Safari/537.36'}

def check():
    page = requests.get(url, headers=headers)
    soup = BeautifulSoup(page.content, 'html.parser')
    title = soup.find(id='productTitle').get_text()
    price = soup.find(id='priceblock_ourprice').get_text()
    est_price = float(price[3:6])
    if(est_price < 470):
        send_mail()

    print(est_price)
    print(title.strip())

    if (est_price > 470):
        send_mail()


def send_mail():
    server= smtplib.SMTP('smtp.gmail',587)
    server.ehlo()
    server.starttls()
    server.ehlo()

    server.login('hyf54657331@gmail.com','lzvpwvdncpzgtqwm')

    subject = 'Price is low now!'
    body = 'Amazon link:https://www.amazon.com/-/zh_TW/dp/B07SPFPKF4/ref=sr_1_10?dchild=1&keywords=hard+drives&qid=1619677444&sr=8-10'
    msg = f'Subject:{subject}\n\n{body}'
    server.sendmail(
        'hyf54657331@gmail.com',
        'hyf54657331@gmail.com',
        msg
    )
    server.quit()
while(True):
    check()
    time.sleep(3600)

