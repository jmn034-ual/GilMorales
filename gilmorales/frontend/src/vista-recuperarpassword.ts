import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-recuperarpassword')
export class VistaRecuperarpassword extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; width: 80%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center;">
   <h1 id="labelRecuperarContrasena">Recuperar contraseña</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center;">
   <vaadin-text-field label="Correo de recuperación:" placeholder="correo@..." id="correoRecuperacionTF"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center;">
   <vaadin-text-field label="Código:" id="codigoTF"></vaadin-text-field>
   <vaadin-button id="enviarCodigoB" style="align-self: flex-end;">
    Enviar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="align-self: center;">
   <vaadin-password-field label="Contraseña" placeholder="" value="secret1" id="contrasenaTF" has-value></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="align-self: center;">
   <vaadin-button id="enviarB" style="height: 100%;">
    Enviar
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="align-self: center;">
   <label id="crarCuentaL" style="align-self: center;">¿No tienes cuenta? Crea una.</label>
   <vaadin-button id="registrarseB" style="align-self: center;">
    Registrarse
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
