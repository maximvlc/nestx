
# Nestx 
A full stack infrastructure base on nestjs <a href="README.zh-CN.md"> 中文说明 </a> [demo](http://typerx.top) 
account:
admin
888888

## What is Nestx
Nestx is a full stack real project base on nestjs framework.
This project is infrastructure for scale and extendable system.

Includes:
- nest-server server side
- nest-swagger Swagger generator
- nest-angular Angular backend client
- nest-react  React backend client
- nest-testing API testing

## Why Nestjs 

Nestjs provides nodejs back-end modular management, completed controller annotation decorators, powerful module integration capabilities, and friendly with Angular.

## Why Swagger

Swagger is for rest api standard. it has benifit on decoupling but connecting between backend and frontend.

Swagger provides good choices for swagger -> front , swagger -> server -> front implement sequence.

Swagger can easily generate front-end proxy codes, basic domain codes, and basic test interface codes, making coding easy and efficient etc.

## Why Lerna

Lerna provides a set of command line convenience easily maintain modules.

## why angular and react 

Angular and react both of them have large high quality UI libraries, good to use them switchable, but typescript is necessary.

## Why needs testing

Testing is an effective guarantee of project quality, and persistent testing codes are necessary means of project iteration.

## Gets start

prepare: To change .env for your own settings

```
npm install lerna -g
```

```
lerna bootstrap
```

```
npm run start:serve
```

```
npm run start:angular
```
 
### Features

| functions    |  basic        |  full        |
| -----------  |  -----------  |  ----------- |
| Login        | √             |              |
| Settings     | √             |              |
| Users        | √             |              |
| Roles        | √             |              |
| Dictionary   | √             |              |
| Logs         | √             |              |
| Menus        | √             |              |

### source code struct

```

├── README.md
├── README.zh-CN.md
├── docs
│   ├── NestJsRBAC.1.md
│   ├── NestJsRBAC.2.md
│   └── README.md
├── lerna.json
├── nestx.code-workspace
├── package.json
└── packages
    ├── clients
    │   ├── nest-angular
    │   └── nest-react
    └── servers
        ├── nest-server
        ├── nest-swagger
        ├── nest-testing
        ├── nestx-auth
        ├── nestx-base
        ├── nestx-cms
        ├── nestx-common
        └── nestx-config
        
 ```



