import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-gestionar-denuncias')
export class VistaGestionarDenuncias extends LitElement {
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
<vaadin-vertical-layout style="height: 100%; width: 100%; padding: 0px; margin: 0px;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="border-radius: 10px; width: 70%; background-color: #F5F5F5; align-self: center; padding: 16px; margin-top: 10%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center;">
   <h1 id="datos" style="padding: 0px; margin: 0px;">Datos del administrador</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout1" style="flex-grow: 0; flex-shrink: 0; border-radius: 10px; border: 2px solid #F5F5F5; align-self: center; padding: var(--lumo-space-xl); width: 90%; background-color: white;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 40%; align-items: center;">
    <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="flex-grow: 0; align-self: center; justify-content: center; flex-shrink: 0; width: 100%;">
     <vaadin-avatar id="fotoUsuario" style="width: 300px; height: 300px; align-self: center;"></vaadin-avatar>
    </vaadin-horizontal-layout>
    <vaadin-button id="addFoto" style="align-self: center;" theme="primary">
      Añadir foto 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="flex-grow: 0; flex-shrink: 0; border-radius: 10px; border: 2px solid #F5F5F5; align-self: center; padding: var(--lumo-space-xl); background-color: white; font-weight: bold;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
     <label>Nombre:</label>
     <label id="nombre">Nombre</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
     <label>Fecha Contratación:</label>
     <label id="fecha">00/00/0000</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5">
     <label>Código Empleado:</label>
     <label id="código">Código </label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout6" style="width: 50%; height: 30%; align-self: center; justify-content: center; flex-grow: 0; align-items: center;">
    <vaadin-button id="verDenuncias" style="align-self: center; flex-shrink: 1;" theme="primary error">
      Ver denuncias 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
