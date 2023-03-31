import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start;
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%;
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: flex-end;
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: flex-end; flex-grow: 1;
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: flex-end; flex-grow: 1; justify-content: flex-end;
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: flex-end; flex-grow: 1; justify-content: center;
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: flex-end; flex-grow: 1; justify-content: flex-start;
import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: center; flex-grow: 1; justify-content: flex-start;
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-publicaciones-administrador-item')
export class VistaListaPublicacionesAdministradorItem extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin: var(--lumo-space-m); width: 90%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 1; width: 15%; align-self: center; justify-content: center;">
   <div id="fotoPerfil" style="flex-grow: 0;">
     Div 
   </div>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1">
   <vaadin-button theme="tertiary" id="nombreDeUsuario" style="nombreDeUsuario">
    NombreDeUsuario
   </vaadin-button>
   <label id="localizacion" style="align-self: center;">Geolocalización</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="flex-wrap: wrap; width: 100%; justify-content: flex-end;">
   <vaadin-button id="eliminarB" style="align-self: center;">
    Eliminar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 100%; height: 20%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="justify-content: center; width: 45%;">
   <div id="video">
     Div 
   </div>
   <label id="numeroVisualizaciones">0</label>
   <label id="visualizacionesL">Visualizaciones </label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="flex-grow: 0; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout6" style="flex-grow: 0; justify-content: flex-end; align-items: flex-end; width: 28%;">
     <label id="numeroMeGustas">0</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout7" style="flex-grow: 0; justify-content: flex-end; width: 25%;">
     <label id="numeroComentarios">0</label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout8" style="flex-grow: 0; justify-content: center; width: 80%;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout9" style="flex-grow: 1; justify-content: center;">
     <label id="meGustasL" style="align-self: center;">Me gustas</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout10" style="flex-grow: 1; justify-content: flex-start;">
     <vaadin-button id="comentariosB">
      Ver comentarios
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" _vaadin_designer_import_href="import 'http://localhost:55478/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-horizontal-layout.js';" draggable="true" vaadin-dnd-layout-item="true" style="align-self: flex-start; width: 100%; align-items: center; flex-grow: 1; justify-content: flex-start;" id="vaadinHorizontalLayout11">
    <label id="descripcion">Descripcion</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
