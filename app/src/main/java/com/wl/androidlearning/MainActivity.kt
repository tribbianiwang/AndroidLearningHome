package com.wl.androidlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wl.androidlearning.designpattern.adapter.AudioPlayer
import com.wl.androidlearning.designpattern.bridge.GreenCircle
import com.wl.androidlearning.designpattern.bridge.RedCircle
import com.wl.androidlearning.designpattern.builder.*
import com.wl.androidlearning.designpattern.factory.FactoryProducer
import com.wl.androidlearning.designpattern.factory.ShapeFactory
import com.wl.androidlearning.designpattern.prototype.Circle
import com.wl.androidlearning.designpattern.prototype.Rectangle
import com.wl.androidlearning.designpattern.prototype.ShapeCache
import com.wl.androidlearning.designpattern.prototype.Square
import com.wl.androidlearning.designpattern.singleton.SingleObject
import com.wl.androidlearning.designpattern.singleton.Singleton
import com.wl.androidlearning.designpattern.singleton.SingletonEnum

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //工厂模式

//        var circle = ShapeFactory.createShape("circle")
//        var rectangle = ShapeFactory.createShape("rectangle")
//        var square = ShapeFactory.createShape("square")
//
//        circle?.draw()
//        rectangle?.draw()
//        square?.draw()

        //抽象工厂模式
        var shapeFactory = FactoryProducer.createFactory("shapeFactory")
        var circle = shapeFactory?.createShape("circle")
        var rectangle = shapeFactory?.createShape("rectangle")
        var square = shapeFactory?.createShape("square")

        circle?.draw()
        rectangle?.draw()
        square?.draw()

        var colorFactory = FactoryProducer.createFactory("colorFactory")
        var red = colorFactory?.createColor("red")
        var green = colorFactory?.createColor("green")
        var blue = colorFactory?.createColor("blue")

        red?.fill()
        green?.fill()
        blue?.fill()


        var singleObject = SingleObject.getInstance()
        singleObject.showMessage()

        var singleton = Singleton.getInstance()
        singleton.showMessage()

        var singletonEnum = SingletonEnum.INSTANCE
        singletonEnum.showMessage()


        Log.d("test","newfdsfasdftest")

        var mealBuilder =MealBuilder()
        var meal = mealBuilder.createNoVegMeal()
        meal.cost
        meal.showItems()

        var mealB =  mealBuilder.createVegMeal()
        mealB.cost
        mealB.showItems()

        //原型模式
       ShapeCache.loadCatch()


        var circleProto =  ShapeCache.getShape("1") as Circle
        var rectangleProto =  ShapeCache.getShape("2") as Rectangle
        var squareProto =  ShapeCache.getShape("3") as Square
        Log.d("proto","circle:${circleProto.type}--rect:${rectangleProto.type}--suqare:${squareProto.type}")


        //适配器模式
        var audioPlayer = AudioPlayer()
        audioPlayer.play("mp3","月亮之上")
        audioPlayer.play("mp4","天下足球")
        audioPlayer.play("vlc","锵锵行天下")
        audioPlayer.play("mkv","我们这一天")
        
        //桥接模式
        var redCircle = com.wl.androidlearning.designpattern.bridge.Circle(RedCircle(),5,40,40)
        redCircle.draw()

        var greenCircle = com.wl.androidlearning.designpattern.bridge.Circle(GreenCircle(),5,40,40);
        greenCircle.draw()
    }
}