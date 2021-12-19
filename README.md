# UI автотесты для главной страницы petshop.ru

## Cписок автоматизированных тест-кейсов в данном проекте:

- [x] Проверки, кошечки
- [x] Проверки, что страницы секции "О компании" содержат правильные названия
- [x] Проверки, собачки
- [x] Проверка, птички

## Стек технологий:

![Intelij_IDEA](images/logos/Intelij_IDEA.png)![Java](images/logos/Java.png)![Selenide](images/logos/Selenide.png)![Selenoid](images/logos/Selenoid.png)![Gradle](images/logos/Gradle.png)![JUnit5](images/logos/JUnit5.png)![Allure Report](images/logos/Allure_Report.png)![AllureTestOps](images/logos/AllureTestOps.png)![Github](images/logos/Github.png)![Jenkins](images/logos/Jenkins.png)![Telegram](images/logos/Telegram.png)![Jira](images/logos/Jira.png)

Java, Gradle, JUnit5, Selenide, Jenkins, Selenoid, Allure Reports, Telegram (уведомления), Jira, TestOps

### Для запусков автотестов используется Jenkins.

##### Примеры готовых сборок можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/09-andreikuzn-smallUIproject/)

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

##### Открыть сборку Jenkins [по ссылке](https://jenkins.autotests.cloud/job/09-andreikuzn-smallUIproject/)
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

##### Примеры запусков и их результаты можно посмотреть [по ссылке](https://allure.autotests.cloud/project/718/dashboards)

### Пример списка тестов и их прохождения в Allure TestOps

![Allure TestOps](./img/Allure_TestOps.png)

### Результаты запусков Launches в Allure TestOps

![Allure_Launches](./img/Allure_Launches.png)

### Основной Dashboards

![Allure Dashboards](img/Allure_Dashboards.png)

### Добавлена интеграция с Jira, где можно посмотреть запускаемые кейсы и их результаты.

##### Перейти в Jira можно [по ссылке](https://jira.autotests.cloud/browse/HOMEWORK-281)

![Jira](./img/Jira.png)

### После прохождения тестов в telegram канал приходит оповещение с результами.

![Telegram](./img/Telegram.jpg)

### Пример прохождения тестов можно посмотреть на видео

![video](./img/video.gif)


Java, Gradle, JUnit5, Selenide, Jenkins, Selenoid, Allure Reports, Telegram (уведомления), Jira, TestOps


### Для запусков автотестов используется Jenkins.

##### Примеры готовых сборок можно посмотреть [по ссылке](https://jenkins.autotests.cloud/job/09-andreikuzn-smallUIproject/)

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

##### Открыть сборку Jenkins [по ссылке](https://jenkins.autotests.cloud/job/09-andreikuzn-smallUIproject/)
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

##### Примеры запусков и их результаты можно посмотреть [по ссылке](https://allure.autotests.cloud/project/718/dashboards)

### Пример списка тестов и их прохождения в Allure TestOps

![Allure TestOps](./img/Allure_TestOps.png)

### Результаты запусков Launches в Allure TestOps

![Allure_Launches](./img/Allure_Launches.png)

### Основной Dashboards

![Allure Dashboards](img/Allure_Dashboards.png)

### Добавлена интеграция с Jira, где можно посмотреть запускаемые кейсы и их результаты.

##### Перейти в Jira можно [по ссылке](https://jira.autotests.cloud/browse/HOMEWORK-281)

![Jira](./img/Jira.png)

### После прохождения тестов в telegram канал приходит оповещение с результами.

![Telegram](./img/Telegram.jpg)

### Пример прохождения тестов можно посмотреть на видео

![video](./img/video.gif)