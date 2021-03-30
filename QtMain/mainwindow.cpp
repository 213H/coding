#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QPushButton>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    QPushButton* btn = new QPushButton;
    btn->resize(40, 40);
    btn->setParent(this);
    btn->setText("Start");
    btn->setStyleSheet("QPushButton{background-color: red;}\
                        QPushButton:hover{background-color: blue;}\
                        QPushButton:pressed{background-color: green;}");
    btn->show();
}

MainWindow::~MainWindow()
{
    delete ui;
}

