import 'dart:html';

import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Wisata Bandung',
      theme: ThemeData(),
      home: const DetailScreen(),
    );
  }
}

class DetailScreen extends StatelessWidget {
  const DetailScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: SafeArea(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          Container(
              margin: EdgeInsets.only(top: 25.0),
              child: Text(
                'lembang farm house',
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 30.0, fontWeight: FontWeight.bold),
              )),
          Container(
            margin: EdgeInsets.symmetric(vertical: 26.0),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: <Widget>[
                Container(
                  child: Column(
                    children: <Widget>[
                      Icon(Icons.calendar_today),
                      SizedBox(height: 8.0),
                      Text('open everyday'),
                    ],
                  ),
                ),
                Container(
                  margin: EdgeInsets.symmetric(vertical: 26.0),
                  child: Column(
                    children: <Widget>[
                      Column(
                        children: <Widget>[
                          Icon(Icons.access_time),
                          SizedBox(height: 8.0),
                          Text('09.00 - 20.00'),
                        ],
                      )
                    ],
                  ),
                ),
                Container(
                  margin: EdgeInsets.symmetric(vertical: 26.0),
                  child: Column(
                    children: <Widget>[
                      Column(
                        children: <Widget>[
                          Icon(Icons.monetization_on),
                          SizedBox(height: 8.0),
                          Text('Rp. 25000,00'),
                        ],
                      )
                    ],
                  ),
                ),
              ],
            ),
          ),
          Container(
            padding: EdgeInsets.all(16.0),
            child: Text(
              'Berada di jalur utama Bandung-Lembang, Farm House menjadi objek wisata yang tidak pernah sepi pengunjung. Selain karena letaknya strategis, kawasan ini juga menghadirkan nuansa wisata khas Eropa. Semua itu diterapkan dalam bentuk spot swafoto Instagramable.',
              textAlign: TextAlign.center,
              style: TextStyle(fontSize: 16.0),
            ),
          ),
          Container(
            margin: EdgeInsets.symmetric(horizontal: 26.0),
           child: Row(
            children: <Widget>[
              Column(
                children: <Widget>[
                  Icon(Icons.mobile_friendly_rounded),
                  SizedBox(height: 26.0,),
                  Text('anjay test'),
                ],
              ),
              Container(
                child: Column(
                  children: <Widget>[
                    Icon (Icons.monetization_on_sharp),
                    SizedBox(height: 26.0, width: 18.0,),
                    Text('harga murah'),
                  ],
                ),
              )
            ],
           ),
          )
        ],
      ),
    ));
  }
}
