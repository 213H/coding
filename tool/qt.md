## Intro

- widget

- mainWindow    extends widget

- dialog        extends widget
  
QT += core gui

a.exec()        message loop

### shortcut

ctrl + r    run
ctrl + b    build
f2          man
alt + ->    
alt + <-    back

MainWindow()    constructor
~MainWindow()   destructor

this->setWindowTitle()
this->resize(300, 500)
this->setFixedSize(300, 400)

QButton* btn = new QButton;
btn->setText("start")
btn->setParent(this)
btn->setStyleSheet("QPushButton{background-color: red;}\
                    QPushButton:hover{background-color: blue;}\
                    QPushButton:pressed{background-color: green;}")
btn->show()

### Object Tree

QObject     //follow with parent

