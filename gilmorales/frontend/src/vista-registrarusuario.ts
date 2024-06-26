import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-registrarusuario')
export class VistaRegistrarusuario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; background-color: #ffffff;" id="vaadinVerticalLayout" theme="spacing-xs">
 <h1 id="h1" style="align-self: center;">Registrarse</h1>
 <vaadin-avatar id="vaadinAvatar" style="align-self: center; width: 150px; height: 150px;"></vaadin-avatar>
 <vaadin-vertical-layout theme="spacing" style="width: 70%; align-self: center; flex-grow: 0; flex-shrink: 1;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout2">
   <label style="width: 20%; align-self: center;" id="label1">Nombre:</label>
   <vaadin-text-field style="width: 100%;" id="nombreTF" required></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout3">
   <label style="width: 20%; align-self: center;" id="label2">Apellidos:</label>
   <vaadin-text-field style="width: 100%;" id="apellifosTF"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout4">
   <label style="width: 20%; align-self: center;" id="label3">Email:</label>
   <vaadin-text-field style="width: 100%;" id="email" required></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout5">
   <label style="width: 20%; align-self: center;" id="label4">Contraseña:</label>
   <vaadin-text-field style="width: 100%;" id="contrasenaTF" required></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout6">
   <label style="width: 20%; align-self: center;" id="label5">Confirmar:</label>
   <vaadin-text-field style="width: 100%;" id="confirmarTF" required></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout7">
   <label style="width: 20%; align-self: center;" id="label6">Descripción:</label>
   <vaadin-text-field style="width: 100%;" id="descripcionTF"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout8">
   <label style="width: 20%; align-self: center;" id="label7">Nombre de usuario:</label>
   <vaadin-text-field style="width: 100%;" id="nombreDeUsuarioTF" required></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout9">
   <label style="width: 15%; align-self: center;" id="label8">Fecha de naciemiento:</label>
   <vaadin-date-picker id="fecha" required></vaadin-date-picker>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout10">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 80%;" id="vaadinHorizontalLayout10">
    <label style="width: 40%;" id="label9">Tipo de usuario:</label>
    <vaadin-checkbox id="normal">
      Normal 
    </vaadin-checkbox>
    <vaadin-checkbox id="comercial" style="flex-grow: 0;">
      Comercial 
    </vaadin-checkbox>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout11">
    <vaadin-button style="flex-grow: 1; width: 100%;" id="subirFoto">
      Subir fotografía 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing-l" style="align-self: center; flex-grow: 0; margin: var(--lumo-space-l); width: 30%;" id="vaadinHorizontalLayout12">
  <vaadin-button style="flex-grow: 1; width: 100%;" id="descartar">
    Descartar 
  </vaadin-button>
  <vaadin-button style="width: 100%;" id="confirmar">
    Confirmar 
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
