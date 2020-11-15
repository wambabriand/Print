import { DeveloperBoard } from '@material-ui/icons';
import React from 'react';
import { Route, Switch } from 'react-router-dom';
import PrivateRoute from '../authentication/PrivateRoute';
import UserClient from '../client/UserClient';
import Home from '../home/Home';
import Login from '../login/Login';

const Content = () => (
    <Switch>
        <Route  path='/home' component={Home} />
        <Route  path='/login' component={Login} />
        <PrivateRoute path='/' component={UserClient} />
    </Switch>
);

export default Content;


//git branch develop // pour creer la branche develop 
//git checkout develop // pour me placer la branche develop 
//git push --set-upstream origin develop  // pour pusher la branche develop 

//git fetch // pour recuperer toutes les modifications
