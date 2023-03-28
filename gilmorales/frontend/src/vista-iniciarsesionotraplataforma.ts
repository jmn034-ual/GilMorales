import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-iniciarsesionotraplataforma')
export class VistaIniciarsesionotraplataforma extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; width: 60%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center;">
   <h1 id="labelOtraCuenta">Seleccionar cuenta</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center;">
   <vaadin-avatar id="fotoUser1"></vaadin-avatar>
   <vaadin-button theme="tertiary" id="botonCuenta1">
    Cuenta 1
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout2">
   <vaadin-avatar id="fotoUser2"></vaadin-avatar>
   <vaadin-button theme="tertiary" id="botonCuenta2">
    Cuenta 2
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout3">
   <vaadin-avatar id="fotoUser3"></vaadin-avatar>
   <vaadin-button theme="tertiary" id="botonCuenta3">
    Cuenta 3
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout4">
   <vaadin-avatar id="fotoUser4"></vaadin-avatar>
   <vaadin-button theme="tertiary" id="botonCuenta4">
    Cuenta 4
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="align-self: center;">
   <vaadin-button id="botonUsarOtraCuenta">
    Usar otra cuenta 
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
