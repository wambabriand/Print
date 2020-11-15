import React from 'react';
import { Route } from 'react-router-dom';
import Login from '../login/Login';
import { useAuthContext } from './AuthContext';

const PrivateRoute = ({component, ...options}) => {
    // ici je peux prendre le token dans le localStorage
    // en fonction du token je decide si je vais continuer ou pas
    const {user} = useAuthContext();
    const finalComponent = user ? component : Login;

    return (<Route component={finalComponent} {...options}/>);
}

export default PrivateRoute;