package app.sano.picchi.flashcardplus

import java.security.AccessControlContext

class Card (
    var imageId :Int,
    var title:String,
    var content:String,
    var meaning:String,
    var likenum:Int=0)