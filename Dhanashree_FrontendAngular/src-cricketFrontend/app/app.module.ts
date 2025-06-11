import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AddplayerComponent } from './addplayer/addplayer.component';
import { ListplayerComponent } from './listplayer/listplayer.component';
import { SearchplayerComponent } from './searchplayer/searchplayer.component';
import { UpdateplayerComponent } from './updateplayer/updateplayer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    AddplayerComponent,
    ListplayerComponent,
    SearchplayerComponent,
    UpdateplayerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
