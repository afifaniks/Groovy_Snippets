package regex

import org.jsoup.Jsoup

/**
 * Project: Groovy_Practice
 * Author: AFIF AL MAMUN
 * Created in 8/6/20
 * Web: https://afifaniks.me
 */

def getFederalSubject(html) {
    def regTableData = /<div(.|\n)*>(.|\n)*<a(.|\n)*?>([A-Za-z -\\(\\)]+)(?=<\\/a>)/
    def tableRow = html =~ regTableData

    if (tableRow.find()) {
        def  federalSub = tableRow.group(4)
           return federalSub
    }

}

def getImageURL(html) {
    def regImageURL = /(<td(.|\n)*src="\/\/)(.*?)(")/
    def url = html =~ regImageURL

    if (url.find()) {
        return "http://" + url.group(3)
    }
}

def getGovernorName(html) {
    def regName = /(<td(.|\n)*?>)([A-Za-z ]+)/
    def name = html =~ regName

    if (name.find()) {
        return name.group(3)
    }
}

def getDate(html) {
    def regDate = /(<td(.|\n)*?>)([A-Za-z0-9, ]+)/
    def date = html =~ regDate

    if (date.find()) {
        def dateString = date.group(3)
        def dateArr = dateString.split("[ ,]")
        def d = Date.parse('MMM', dateArr[0])
        def num = d.format('MM') as int

        return num + "/" + dateArr[1] + "/" + dateArr[3]

    }
}

def getTermExpireDate(html) {
    def regDate = /(<td(.|\n)*?>)([0-9\n]+)/
    def date = html =~ regDate

    if (date.find()) {
        return date.group(3)
    }
}


def doc = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_heads_of_federal_subjects_of_Russia").get()
def table = doc.select("table tbody")[2]
def tableRow = table.select("tr")


for (def i = 2; i < tableRow.size(); i++) {
    def tableData = tableRow[i].select("td")

    // Get Formatted Data
    def federalSub = getFederalSubject(tableData[0])
    def imageURL = getImageURL(tableData[2])
    def gName = getGovernorName(tableData[3])
    def tookOffice = getDate(tableData[6])
    def termEnds = getTermExpireDate(tableData[7])


    println("Federal Subject: " + federalSub)
    println("Governor Name: " + gName)
    println("Image URL: " + imageURL)
    println("Took Office: " + tookOffice)
    println("Term Ends: " + termEnds)
    println("\n")


}