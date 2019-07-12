import time
from string import join

import requests


def getPercent(old, new):
    p = (new - old) / old * 100
    return round(p, 2)


stockMapping = {
    "KM": "sh600518",
    "SJ": "sz000681",
    "HC": "sh603909"

}

stockNumbers = join(stockMapping.values(), ",")

while True:
    response = requests.get("http://hq.sinajs.cn/list=" + stockNumbers)
    stocks = response.text.split(";")
    for stock in stocks:
        if "var" not in stock:
            continue

        items = stockMapping.items()

        name = ""
        for item in items:

            if item[1] in stock:
                name = item[0]

        array = stock.split(",")
        before = float(array[2])
        now = float(array[3])
        high = float(array[4])
        low = float(array[5])

        print "{4} n:{0} pN:{1} pL:{2}  pH:{3}".format(now,
                                                       getPercent(before, now),
                                                       getPercent(before, low),
                                                       getPercent(before, high),
                                                       name)
    time.sleep(1)
