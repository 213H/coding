#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QPushButton>
#include <QCheckBox>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    //this->resize(400, 800);
    QPushButton* btn = new QPushButton;
    btn->resize(40, 40);
    btn->setParent(this);
    btn->setText("Start");
    btn->setStyleSheet("QPushButton{background-color: red;}\
                        QPushButton:hover{background-color: blue;}\
                        QPushButton:pressed{background-color: green;}");
    btn->show();
    QCheckBox* cbx = new QCheckBox;
    cbx->setParent(this);

}

MainWindow::~MainWindow()
{
    delete ui;
}

