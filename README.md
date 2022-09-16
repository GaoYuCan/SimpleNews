# SimpleNews
安大通Android招新题目
### 说明

---

1.  此测试题请在2021年技术部招新面试前提交，最终录用结果会在面试之后结合测试题进行综合评定。**测试题的完成情况不会决定是否进入面试阶段。**
1.  使用Java，Kotlin或Flutter。
1.  由于测试题是通过github公有项目的方式提交的，所以[第一题git](#spidS)是必做题。其他题目量力而行即可
1.  对于刚入门的新手来说，这些道题目可能信息量有点大，但这些题目已经涵盖了安卓开发过程中的大部分内容，只不过都比较浅显，成为一个大佬要做的就是以后不断的打磨，深入学习这些内容。所以并不要被这么多陌生的题目吓到，我们不会对这部分测试题有过高的要求。可能并不是每位努力解决这些题目的同学都能够顺利地加入安大通，但如果能让你对安卓开发有一个大致的了解甚至让你对安卓开发打起兴趣，那也是我们的荣幸。
1.  加分项并不是必需项！如果你没有完成加分项的内容，不要气馁，加分项涉及的内容可在日后的开发中慢慢了解。
1.  软件效果不需要和示例效果一模一样，仅需要完成题目考察的内容即可。

## 一、git

---

### 介绍

git是一个版本控制和多人协同开发工具，是每一个程序员都必会的技能。

在本次测试题中，**最终的完成内容需要你都使用git工具以及github网站进行提交。**
### 要求

1.  在电脑上安装git
1.  注册[github](https://github.com/)网站账号
1.  在github中创建一个个人的**公共项目(public project)，命名为AHU-2021-<姓名拼音>**，最终将所有需要提交的内容添加到此项目中，并将**项目链接**发给我(QQ468766131)就好啦。

### 注意事项

1. github上新建的项目要选择类型为public，否则我们是看不到的。
1. 项目管理要规范，包括要注意文件夹的命名以及文件的分类。
1. 提交到gitlab或gitee均可。
## 二、编程

---

### 介绍

写个简单的新闻展示软件吧
### 要求

1. 从 github 上 clone [模版项目](https://github.com/GaoYuCan/SimpleNews) (https://github.com/GaoYuCan/SimpleNews), 模版中提供了本地数据源，data模块自行查看用法。
1. 使用列表控件展示我们提供的新闻数据

   效果图：
   ![Screenshot_1633161770.png](https://cdn.nlark.com/yuque/0/2021/png/21765903/1633161869089-9213a0c3-9f61-4bfe-9cdc-31c04b281cb4.png#clientId=u8743d5e3-f938-4&from=ui&id=ufe93942d&margin=%5Bobject%20Object%5D&name=Screenshot_1633161770.png&originHeight=2280&originWidth=1080&originalType=binary&ratio=1&size=219054&status=done&style=none&taskId=ufa2140ee-c436-494e-ba84-a058ffce6f7)

很简单吧~，下面是加分项：

1. 代码风格良好，编程规范。
1. 使用更强大的RecyclerView。
1. 展示json中的图片。

![Screenshot_1633163084.png](https://cdn.nlark.com/yuque/0/2021/png/21765903/1633163108624-c0092938-ff37-4aa8-8bb4-9b9a647115e3.png#clientId=uf6cdefa6-4c3b-4&from=ui&id=u96ebc77d&margin=%5Bobject%20Object%5D&name=Screenshot_1633163084.png&originHeight=2280&originWidth=1080&originalType=binary&ratio=1&size=373183&status=done&style=none&taskId=u934f1f23-0e69-41ee-a25b-9d6dc101402)
### 注意事项

1. 请将我们提供的json放到assets文件夹内。
1. 信息只需要展示json中key为title的内容。
1. 添加一些注释，简单讲解下你的代码。
## 三、改进1
### 介绍
将刚刚写的新闻展示软件进行改进，使其支持点击查看详细的信息内容
### 要求
点击新闻,跳转到新的界面，并打开使用Webview加载展示内容，也可以利用爬虫实现本地版
![Screenshot_1633165460.png](https://cdn.nlark.com/yuque/0/2021/png/21765903/1633165507489-2d40ae90-f37c-4f4f-b704-84778ede8a6e.png#clientId=ua045818e-5747-4&from=ui&id=u18dc9bd1&margin=%5Bobject%20Object%5D&name=Screenshot_1633165460.png&originHeight=2280&originWidth=1080&originalType=binary&ratio=1&size=337930&status=done&style=none&taskId=u0d2be0f4-09d8-42a6-8cfd-d5f65ea04be)
加分项：

1. 代码风格良好，编程规范。
1. 跳转页面时加入动画。
1. WebView加载动画
1. Webview与Java交互（例如为去除Html中的标题栏，改为原生标题栏并添加返回功能）

![Screenshot_1633166370.png](https://cdn.nlark.com/yuque/0/2021/png/21765903/1633166410097-0a5fa501-be2f-4896-8980-361e736277a6.png#clientId=ub4ccf331-d3d9-4&from=ui&id=ubd90dcc4&margin=%5Bobject%20Object%5D&name=Screenshot_1633166370.png&originHeight=2280&originWidth=1080&originalType=binary&ratio=1&size=335642&status=done&style=none&taskId=ud672c5ff-028b-4df7-849a-9aa6c218141)
## 四、改进2
### 介绍
将刚刚写的信息展示页面再次进行改进，使其支持分享操作
![Screenshot_1633167132.png](https://cdn.nlark.com/yuque/0/2021/png/21765903/1633167164590-a40e3b58-1ab9-4d6e-b656-946eea74a8d8.png#clientId=ub4ccf331-d3d9-4&from=ui&id=u03294f9d&margin=%5Bobject%20Object%5D&name=Screenshot_1633167132.png&originHeight=2280&originWidth=1080&originalType=binary&ratio=1&size=341010&status=done&style=none&taskId=uffceef9a-b8f6-4b8e-9b10-48fab1f8e46)
### ![Screenshot_1633167134.png](https://cdn.nlark.com/yuque/0/2021/png/21765903/1633167178661-40df76e5-89f9-44cf-abab-b7c9c1ae7f5e.png#clientId=ub4ccf331-d3d9-4&from=ui&id=uee5437e5&margin=%5Bobject%20Object%5D&name=Screenshot_1633167134.png&originHeight=2280&originWidth=1080&originalType=binary&ratio=1&size=208282&status=done&style=none&taskId=u7c4413be-1eba-48b8-a8a2-38219c652a0)
### 要求
在展示信息详细页面，添加分享按钮，点击分享按钮，分享url
加分项：

1. 代码风格良好，编程规范。
1. 本地储存每个文章的分享次数。
## 五、改进3

---

### 介绍
不再使用本地的json，改为从网络获取信息
### 要求
使用网络请求访问以下接口，并使用列表对结果进行展示
```http
GET http://39.106.7.220/getNews.php
Response:
Content-Type: application/json

[
	{
  	"url": "详情地址链接",
    "title" : "新闻标题",
    "imgUrl": "新闻封面"
  },
]
```

加分项：

1. 代码风格良好，编程规范。
1. 支持更改信息获取途径(本地数据和网络数据)。
### 
