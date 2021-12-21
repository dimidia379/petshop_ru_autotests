# UI автотесты для страницы товара на сайте petshop.ru

## Cписок проверок:

- [x] Присутствие названия товара в заголовке страницы
- [x] Присутствие названия товара на странице товара
- [x] Присутствие артикула товара на странице товара
- [x] Появление уведомления об успешном добавлении при добавлении товара в корзину
- [x] Отображение количества добавленного товара на кнопке добавления в корзину после добавления товара в корзину
- [x] Отображение надписи "Добавить еще" на кнопке добавления в корзину после добавления товара в корзину

## Стек технологий:

![Java](images/logos/Java.png)![Gradle](images/logos/Gradle.png)![JUnit5](images/logos/JUnit5.png)![Selenide](images/logos/Selenide.png)![Selenoid](images/logos/Selenoid.png)![Allure Report](images/logos/Allure_Report.png)![AllureTestOps](images/logos/AllureTestOps.png)![Jenkins](images/logos/Jenkins.png)![Telegram](images/logos/Telegram.png)![Jira](images/logos/Jira.png)![Intelij_IDEA](images/logos/Intelij_IDEA.png)![Github](images/logos/Github.png)

Java, Gradle, JUnit5, Selenide, Selenoid, Allure Reports, Allure TestOps, Jenkins,  Telegram, Jira, Intelij IDEA, Git

### Для запусков автотестов используется Jenkins.

##### Примеры готовых сборок можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/new_job/)

### Используемые параметры по умолчанию

* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

Запуск тестов с заполненным файлом configurationSelenoid.properties:

```bash
gradle clean test
```

Запуск тестов с не заполненным файлом configurationSelenoid.properties:

```bash
gradle clean -DRemoteBrowserUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:

```bash
allure serve build/allure-results
```

### Запуск тестов в Jenkins

##### Открыть сборку Jenkins [по ссылке](https://jenkins.autotests.cloud/job/new_job/)
##### Нажать на кнопку "Собрать с параметрами"

![Jenkins_Start](./img/Jenkins_Start.png)

##### Выбрать параметры, нажать на кнопку "Собрать"

![Jenkins_Start](./img/Jenkins_Start1.png)

##### Дождаться выполнения сборки. нажать на кнопку "Allure Report"

![Jenkins_Start](./img/Jenkins_Start2.png)

### Анализ результатов запусков в Jenkins через Allure Reports

![Jenkins_Allure_Reports](./img/Jenkins_Allure_Reports.png)

![Jenkins_Allure_Reports1](./img/Jenkins_Allure_Reports1.png)

### Для отображения результатов сборок также используется Allure TestOps.

##### Примеры запусков и их результаты можно посмотреть [по ссылке](https://allure.autotests.cloud/project/111222/dashboards)

### Пример списка тестов и их прохождения в Allure TestOps

![Allure TestOps](./img/Allure_TestOps.png)

### Результаты запусков Launches в Allure TestOps

![Allure_Launches](./img/Allure_Launches.png)

### Основной Dashboards

![Allure Dashboards](img/Allure_Dashboards.png)

### Добавлена интеграция с Jira, где можно посмотреть запускаемые кейсы и их результаты.

##### Перейти в Jira можно [по ссылке](https://jira.autotests.cloud/browse/HOMEWORK-111222)

![Jira](./img/Jira.png)

### После прохождения тестов в telegram канал приходит оповещение с результами.

![Telegram](./img/Telegram.jpg)

### Пример прохождения тестов можно посмотреть на видео

![video](./img/Video.gif)