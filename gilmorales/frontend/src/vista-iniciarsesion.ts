import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-iniciarsesion')
export class VistaIniciarsesion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="height: 100%; width: 100%; justify-content: flex-start; align-self: center; background-color: #ffffff;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; flex-grow: 0;">
  <h1 id="iniciarSesionL" style="flex-grow: 0; flex-shrink: 0; align-self: stretch;">Iniciar Sesión</h1>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%; align-self: center; justify-content: center; height: 15%;">
  <vaadin-text-field label="Usuario" placeholder="Nombre de usuario o correo" id="usuarioTF" style="flex-grow: 1;"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 50%; align-self: center; justify-content: center; height: 15%;" id="vaadinHorizontalLayout2">
  <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" id="contrasenaTF" style="flex-grow: 1; flex-shrink: 1;" has-value></vaadin-password-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="align-self: center; width: 50%;">
  <vaadin-button id="recuperarContrasenaB">
    Recuperar contraseña 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 50%; align-self: center; justify-content: center; height: 10%;" id="vaadinHorizontalLayout4">
  <vaadin-button id="iniciarSesionB" style="align-self: center; flex-grow: 0; width: 30%;">
    Iniciar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout6" style="align-self: center; margin: var(--lumo-space-xl);">
  <label id="noCuentraL" style="align-self: center;">¿No tienes cuenta?</label>
  <vaadin-button id="registrarB" style="align-self: stretch;">
    Registrate 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
