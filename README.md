Play 2.5 Silhouette 4.0 Slick PostgreSQL seed
=====================================

This seed is based on [Play Silhouette seed](https://github.com/mohiva/play-silhouette-seed), but modified to work with PostgreSQL and Slick instead of InMemory database.

## Features

* Sign Up
* Sign In (Credentials)
* Dependency Injection with Guice
* Publishing Events
* Avatar service
* Social Auth (Facebook, Google+, VK, Twitter, Xing, Yahoo)
* Two-factor authentication with Clef
* Remember me functionality
* Password reset/change functionality
* Account activation functionality
* Email sending and auth token cleanup
* [Security headers](https://www.playframework.com/documentation/2.5.x/SecurityHeaders)
* [CSRF Protection](https://www.playframework.com/documentation/2.5.x/ScalaCsrf)

## Planned Features

* Find a way to achieve accessing routes from templates without writing whole `@controllers.auth.routes.SignInController.view` but writing something shorter
* Find out about Scala.js VS Coffeescript (or something similar)
* In case Scala.js wins - implement Scala.js support (including scalatags and scala.css)
* In case Coffeescript wins - implement elixir ([see Laravel Elixir](https://laravel.com/docs/master/elixir)) compilation of asset files

## Documentation

Consult the [Silhouette documentation](http://silhouette.mohiva.com/docs) for more information. If you need help with the integration of Silhouette into your project, don't hesitate and ask questions in our [mailing list](https://groups.google.com/forum/#!forum/play-silhouette) or on [Stack Overflow](http://stackoverflow.com/questions/tagged/playframework).

## Activator

[Activator Template](https://www.lightbend.com/activator/template/play-silhouette-4.0-slick-postgres-seed)

## Getting Started

* Install from activator template or clone this repository
* Copy `database.conf.example` to `database.conf` and fill in your database connection data
* Copy `mailer.conf.example` to `mailer.conf` and fill in your mailer settings
* Copy `silhouette.conf.example` to `silhouette.conf` and fill in with your silhouette settings
* Run project

# License

The code is licensed under [Apache License v2.0](http://www.apache.org/licenses/LICENSE-2.0).
