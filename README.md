# UI автотесты для страницы товара на сайте petshop.ru

## Cписок проверок:

- [x] Присутствие названия товара в заголовке страницы
- [x] Присутствие названия товара на странице товара
- [x] Присутствие артикула товара на странице товара
- [x] Появление уведомления об успешном добавлении при добавлении товара в корзину
- [x] Отображение количества добавленного товара на кнопке добавления в корзину после добавления товара в корзину
- [x] Отображение надписи "Добавить еще" на кнопке добавления в корзину после добавления товара в корзину

## Стек технологий:

![Java](images/logos/Java.png)![Gradle](images/logos/Gradle.png)![JUnit5](images/logos/JUnit5.png)![Selenide](images/logos/Selenide.png)![Selenoid](images/logos/Selenoid.png)![Allure Report](images/logos/Allure_Report.png)![AllureTestOps](images/logos/AllureTestOps.png)![Jenkins](images/logos/Jenkins.png)![Telegram](images/logos/Telegram.png)![Intelij_IDEA](images/logos/Intelij_IDEA.png)![Github](images/logos/Github.png)

Java, Gradle, JUnit5, Selenide, Selenoid, Allure Reports, Allure TestOps, Jenkins,  Telegram,  Intelij IDEA, Git

### Для запуска локально
```
gradle clean test
```

### Для запуска удаленно
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=${REMOTE_DRIVER_URL}
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```


## Для запусков автотестов используется Jenkins.

##### Пример готовой сборки можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/09-Julia_Zvereva-lesson13/)

### Параметры запуска в Jenkins
![Jenkins_params](images/screenshots/Jenkins_params.png)

### Статистика запусков в Jenkins
![Jenkins_statistic](images/screenshots/Jenkins_statistic.png)

### Отчёт о прохождении автотестов в Allure Report
![Allure_report](images/screenshots/Allure_report.png)

### Список автотестов в Allure Report
![Allure_suite](images/screenshots/Allure_suite.png)

### Хранение тестовой документации в Allure TestOps
![Testops](images/screenshots/Testops_cases.png)

### Прохождение тестов в Allure TestOps
![Testops](images/screenshots/Testops.png)

### Уведомления о прохождении автотестов в Telegram
![Telegram](images/screenshots/Telegram.png)

### Видео о прохождении тестов
![video](images/screenshots/vid.gif)